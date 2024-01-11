import socket
import threading
import tkinter as tk
from tkinter import simpledialog

# Client configuration
host = 'localhost'
port = 5555

# Create a socket
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to the server
client.connect((host, port))

# Get the username from the user
root = tk.Tk()
root.withdraw()
username = simpledialog.askstring("Username", "Enter your username", parent=root)


def receive():
    while True:
        try:
            # Receive messages from the server
            message = client.recv(1024).decode('utf-8')
            if message:
                chat_box.insert(tk.END, message + '\n')
                chat_box.yview(tk.END)  # Scroll to the bottom to show the latest message
        except:
            # An error occurred, close the connection
            print("An error occurred!")
            client.close()
            break


def send(event=None):
    # Send messages to the server
    message = f"{username}: {entry.get()}"
    client.send(message.encode('utf-8'))
    entry.delete(0, tk.END)

# GUI setup
root = tk.Tk()
root.title("Chat App")

# Chat display
chat_box = tk.Text(root, height=20, width=50)
chat_box.pack(padx=10, pady=10)

# Message entry
entry = tk.Entry(root, width=40)
entry.pack(padx=10, pady=10)
entry.bind("<Return>", send)

# Send button
send_button = tk.Button(root, text="Send", command=send)
send_button.pack(padx=10, pady=10)

# Start a thread to receive messages
receive_thread = threading.Thread(target=receive)
receive_thread.start()

# Run the GUI main loop
root.mainloop()

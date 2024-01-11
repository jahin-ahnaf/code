import socket
import threading

# Server configuration
host = 'localhost'
port = 5555

# Create a socket
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Bind the socket to a specific address and port
server.bind((host, port))

# Listen for incoming connections
server.listen()

# List to store connected clients
clients = []

def broadcast(message, client_socket):
    for client in clients:
        # Send the message to all clients except the sender
        if client != client_socket:
            try:
                client.send(message)
            except:
                # Remove the client if unable to send the message
                clients.remove(client)

def handle_client(client_socket):
    while True:
        try:
            # Receive message from the client
            message = client_socket.recv(1024)
            if not message:
                break

            # Broadcast the message to all connected clients
            broadcast(message, client_socket)

        except:
            # Remove the client if an error occurs
            clients.remove(client_socket)
            break

def accept_connections():
    while True:
        # Accept a client connection
        client_socket, client_address = server.accept()

        # Add the new client to the list
        clients.append(client_socket)

        # Create a thread to handle the client's messages
        thread = threading.Thread(target=handle_client, args=(client_socket,))
        thread.start()

# Start accepting connections in a separate thread
accept_thread = threading.Thread(target=accept_connections)
accept_thread.start()

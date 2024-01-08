import pygame
import sys
import random

#setup
pygame.init();

display = pygame.display.set_mode((500,500))
clock = pygame.time.Clock()


playerImg = pygame.image.load("player.png")
player = playerImg.get_rect()

player.x = 100
player.y = 100

while True:
    player.x += 10
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

        if player.x > 500:
            player.x = 0
        
        

        
        display.fill((255,255,255))

        display.blit(playerImg, player)
        pygame.display.flip()

        clock.tick(60)

pygame.quit()
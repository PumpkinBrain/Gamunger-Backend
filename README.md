# Gamunger-Backend
Back-end for the world's new renowed dating app/social media, Gamunger! Made by gamers, for g4m3rZ!!@@!!

This is a small project I wanted to make for my return to programming. I'll be trying out a lot of things and I'm a bit rusty so it might get a little messy.

In the controllers package, I created the BaseController class so that I only need to map the default methods that SpringBoot makes available through the CrudRepository interface once.
If necessary, new functions can be added to the repository classes and the respective endpoints can be mapped in the specific controller class.
This will avoid cluttering the controller classes with common use endpoints.

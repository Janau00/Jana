print("welcome to the traveling time application")
distance=float(input("Enter the distance to your destination :"))
speed=float(input("Enter the speed in km\hour :"))
t=distance/speed
print("Time is ",t)
print("you will need :",speed,"hours to arrive")
speed=t*60
print("you will need :",speed,"minutes to arrive")


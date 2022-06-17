# Activity_16
# Create a car class with the following details:
# Properties: manufacturer, model, make, transmission, color
# Methods: accelerate(), stop() and accelerate() to print "{Manufacturer} {Model} is moving",
# stop() to print "{Manufacturer} {Model} has stopped, Using this car class, create 3 different car objects.
class Car:
    'This class represents a car'
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def transmissionType(self):
        print("Car is manufactured by " + self.manufacturer + " and car transmission type is " + self.transmission)

    def makeAndmodel(self):
        print("Car is manufactured by " + self.manufacturer + " and car color is " + self.color)

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = Car("Maruti", "800", "2013", "Manual", "Red")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")

car1.transmissionType()
car2.accelerate()
car1.stop()
car1.makeAndmodel()
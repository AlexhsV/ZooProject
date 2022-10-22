# ZooProject

An admin dashboard for zoo management.

In the code there is an abstract class Animal, which contains the basic characteristics of an animal
such as name and weight. This class is inherited from classes
Alligator,Bear,Elephant,Frog,Giraffe,Gorilla,Lion,Lizard, which use the features of
Animal and some more (eg Giraffe neck length). Also, there is the interface
AnimalOperations, which contains generic animal methods that are overridden in each
from the animal classes.
ZooKeeper class manages the zoo. Specifically in an arraylist type
Animal all animals are stored, while the methods addAnimals(), searchByName(),
searchById(), editById(), removeById(), saveData() cover the basic functions of the application.
The MainForm.java , MainForm.form files house the appropriate code for the gui and main().
(The animal objects that are constructed are stored in the animalsData.bin type file
(Serialization) , when exiting the application, i.e. when pressing X)
Here are some screenshots from the function of creating an animal and displaying the available ones:

![zooapp](https://user-images.githubusercontent.com/98179885/197345247-9eec729f-529b-42c0-9851-683a2948ee01.jpg)

using System;

namespace Day5Homework3AbstractDefinition
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(" Only derived types can support this \"\n" +
                "polymorphic interface.\" Classes in other hierarchies \n" +
                "have no access to this abstract member.\n");
            Console.WriteLine("Multiple inheritance is not possible in C# \n" +
                "for classes\n");
            Console.WriteLine("Although constructors are typically defined \n" +
                "as public, a derived class never inherits the constructors \n" +
                "of a parent class. Constructors are used to construct only \n" +
                "the class that they are defined within, although they can \n" +
                "be called by a derived class through constructor chaining\n");
            Console.WriteLine("C# supplies another keyword, sealed, that \n" +
                "prevents inheritance from occurring. When you mark a class \n" +
                "as sealed, the compiler will not allow you to derive from this type \n");
            Console.WriteLine("C# structures are always implicitly sealed. \n" +
                "Therefore,you can never derive one structure from another structure, \n" +
                " a class from a structure, or a structure from a class.Structures \n" +
                "can be used to model only stand-alone, atomic, user-defined data \n" +
                "types.If you want to leverage the is-a relationship, \n" +
                "you must use classes \n");
            Console.WriteLine("You may use the base keyword whenever a subclass wants \n" +
                " to access a public or protected memberdefined by a parent class.\n" +
                "Use of this keyword is not limited to constructor logic.You will see \n" +
                "examples using base in this manner during the examination of polymorphism\n");
            Console.WriteLine("once you add a custom constructor to a class definition, \n" +
                "the default constructor is silently removed.Therefore, be sure to redefine \n" +
                " the default constructor");
            Console.WriteLine("The benefit of defining protected members in a base class \n" +
                "is that derived types no longer have to access the data indirectly using \n" +
                "public methods or properties.The possible downfall, of course, is that when \n" +
                "a derived type has direct access to its parent’s internal data, it is \n" +
                "possible to accidentally bypass existing business rules found within \n" +
                "public properties.When you define protected members, you are creating \n" +
                " a level of trust between the parent class and the child class, as the \n" +
                "compiler will not catch any violation of your type’s business rules \n");
            Console.WriteLine("Although protected field data can break encapsulation, \n" +
                "it is quite safe (and useful) to define protected methods.When building \n" +
                "class hierarchies, it is common to define a set of methods that are only \n" +
                "for use by derived types and are not intended for use by the outside world\n");


        }
    }
}

using System;

namespace Video46Inheritance
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Person[] people = new Person[3]
            {
                new Customer
                {
                    FirstName= "Engin"
                }, new Student
                {
                    FirstName= "Derin"
                }, new Person
                {
                    FirstName= "Salih"
                }
            };
            foreach (var person in people)
            {
                Console.WriteLine(person.FirstName);
            }

        }
    }
}

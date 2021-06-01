using System;
using System.Collections.Generic;
using System.Text;

namespace Day2Homework6ProductListJune
{
    public class Meal : IEquatable<Meal>
    {
        public string MealName { get; set; }
        public int MealId { get; set; }
        public string Category { get; set; }
        public double Price { get; set; }
        public override string ToString()
        {
            return "ID: " + MealId + "  Category: " + Category + "  Price: " + Price + "  Name: " + MealName;
        }
        public override bool Equals(object obj)
        {
            if (obj == null) return false;
            Meal objAsPart = obj as Meal;
            if (objAsPart == null) return false;
            else return Equals(objAsPart);
        }
        public override int GetHashCode()
        {
            return MealId;
        }
        public bool Equals(Meal other)
        {
            if (other == null) return false;
            return (this.MealId.Equals(other.MealId));
        }
        // Should also override == and != operators.
    }
}

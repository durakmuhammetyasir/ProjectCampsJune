using System;

namespace Day3Homework2KeywordsRefOut
{
    class KeywordsRefOut
    {
        static void Main(string[] args)
        {
            /*
             Parameter      Type Modifier Used at Declaration? Used at Invocation? Implementation
                Value       None                                                    The system copies the value of the actual parameter to the formal parameter.
                Reference   ref                 Yes                 Yes             The formal parameter is an alias for the actual parameter.
                Output      out                 Yes                 Yes             The parameter contains only a returned value. The formal parameter is an alias for the actual parameter.
                Array       params              Yes                 No              The parameter allows passing a variable number of actual parameters to a method.
            */

            /*
             Parameter Modifier     Meaning in Life
            (None)                  If a parameter is not marked with a parameter modifier, it is assumed to be passed by value, meaning the called method receives a copy of the original data.
            out                     Output parameters must be assigned by the method being called and, therefore, are passed by reference. If the called method fails to assign output parameters, 
                                        you are issued a compiler error.
            ref                     The value is initially assigned by the caller and may be optionally modified by the called method (as the data is also passed by reference). 
                                        No compiler error is generated if the called method fails to assign a ref parameter.
            params                  This parameter modifier allows you to send in a variable number of arguments as a single logical parameter. A method can have only a single params modifier, 
                                        and it must be the final parameter of the method. In reality, you might not need to use the params modifier all too often; however, 
                                        be aware that numerous methods within the base class libraries do make use of this C# language feature.
            */

            /*
                Intriguing Question                                 Value Type                                                                                              Reference Type
                Where are objects allocated?                        Allocated on the stack.                                                                                 Allocated on the managed heap.
                How is a variable represented?                      Value type variables are local copies.                                                                  Reference type variables are pointing to the memory occupied by the allocated instance.
                What is the base type?                              Implicitly extends System.ValueType.                                                                    Can derive from any other type (except System.ValueType), as long as that type is not “sealed” 
                Can this type function as a base to other types?    No. Value types are always sealed and cannot be inherited from.                                         Yes. If the type is not sealed, it may function as a base to other types.
                What is the default parameter passing behavior?     Variables are passed by value (i.e., a copy of the variable is passed into the called function).        For reference types, the reference is copied by value.
                Can this type override System.Object.Finalize()?    No.                                                                                                     Yes, indirectly.
                Can I define constructors for this type?            Yes, but the default constructor is reserved (i.e., your custom constructors must all have arguments).  But, of course!
                When do variables of this type die?                 When they fall out of the defining scope.                                                               When the object is garbage collected.
            */
        }
    }
}

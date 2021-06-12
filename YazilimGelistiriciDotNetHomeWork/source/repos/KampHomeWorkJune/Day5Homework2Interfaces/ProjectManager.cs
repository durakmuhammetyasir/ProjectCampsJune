using System;
using System.Collections.Generic;
using System.Text;

namespace Day5Homework2Interfaces
{
    class ProjectManager
    {
        public void Add(IPersonManager personManager)
        {
            personManager.Add();
        }
    }
}

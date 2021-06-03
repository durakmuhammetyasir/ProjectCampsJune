namespace Video21MethodsWOutParameterJune
{
    public class Countdown
    {
        public Countdown()
        {
            int x = 10;
            Recursion(x);
            System.Console.WriteLine("Done");
            void Recursion(int i)
            {
                if (i <= 0) return;
                System.Console.WriteLine(i);
                System.Threading.Thread.Sleep(1000); // wait 1 second
                Recursion(i - 1);
            }
        }
    }
}
using System;
using System.Data.SqlClient;
using System.Text;

namespace eTicaret
{
    class Program
    {
        static void Main(string[] args)
        {
            try 
            { 
                SqlConnectionStringBuilder builder = new SqlConnectionStringBuilder();

                builder.DataSource = "localhost"; 
                builder.UserID = "sa";            
                builder.Password = "password2021";     
                builder.InitialCatalog = "master";
         
                using (SqlConnection connection = new SqlConnection(builder.ConnectionString))
                {
                    Console.WriteLine("\nQuery data example:");
                    Console.WriteLine("=========================================\n");
                    
                    connection.Open();       

                    String sql = "SELECT name, collation_name FROM sys.databases";

                    using (SqlCommand command = new SqlCommand(sql, connection))
                    {
                        using (SqlDataReader reader = command.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                Console.WriteLine("{0} {1}", reader.GetString(0), reader.GetString(1));
                            }
                        }
                    }
                    Console.Write("Creating eTicaret Profile table with data, press any key...");
                    Console.ReadKey(true);

                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.Append("USE eTicaret;");    
                    stringBuilder.Append("CREATE TABLE Brand( ");
                    stringBuilder.Append(" id BIGINT IDENTITY(1,1) NOT NULL PRIMARY KEY, ");
                    stringBuilder.Append(" name NVARCHAR(100) NOT NULL, ");
                    stringBuilder.Append(" create_date DATETIME NOT NULL DEFAULT GETDATE(), ");
                    stringBuilder.Append(" active BIT NOT NULL DEFAULT 1 ");
                    stringBuilder.Append(" ); ");
                    stringBuilder.Append("INSERT INTO Brand (name, active) VALUES ");
                    stringBuilder.Append("(N'Microsoft' , N'0'),");
                    stringBuilder.Append("(N'Apple',N'1');");
                    sql = stringBuilder.ToString();
                    using (SqlCommand command = new SqlCommand(sql,connection))
                    {
                        command.ExecuteNonQuery();
                        Console.WriteLine("Done.");
                    }
                    Console.Write("Creating eTicaret Brand table done, press any key...");
                    Console.ReadKey(true);               
                }
            }
            catch (SqlException e)
            {
                Console.WriteLine(e.ToString());
            }
            Console.WriteLine("\nDone. Press enter.");
            Console.ReadLine(); 
        }
    }
}

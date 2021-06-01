using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;

namespace Day2Homework6ProductListJune
{
    class Day2Homework6ProductListJune
    {
        static void Main(string[] args)
        {
            Categories category1 = new Categories(1, "Corbalar");
            Categories category2 = new Categories(2, "Karadeniz Et Doneri");
            Categories category3 = new Categories(3, "Izgaralar");
            Categories category4 = new Categories(4, "Ana Yemekler");
            Categories category5 = new Categories(5, "Makarnalar");
            Categories category6 = new Categories(6, "Salatalar");
            Categories category7 = new Categories(7, "Tatlilar");
            Categories category8 = new Categories(8, "İcecekler");
            Console.WriteLine("category1 CategoryId = {0} CategoryName = {1}", category1.CategoryId, category1.CategoryName);
            Console.WriteLine("category2 CategoryId = {0} CategoryName = {1}", category2.CategoryId, category2.CategoryName);
            Console.WriteLine("category3 CategoryId = {0} CategoryName = {1}", category3.CategoryId, category3.CategoryName);
            Console.WriteLine("category4 CategoryId = {0} CategoryName = {1}", category4.CategoryId, category4.CategoryName);
            Console.WriteLine("category5 CategoryId = {0} CategoryName = {1}", category5.CategoryId, category5.CategoryName);
            Console.WriteLine("category6 CategoryId = {0} CategoryName = {1}", category6.CategoryId, category6.CategoryName);
            Console.WriteLine("category7 CategoryId = {0} CategoryName = {1}", category7.CategoryId, category7.CategoryName);
            Console.WriteLine("category8 CategoryId = {0} CategoryName = {1}", category8.CategoryId, category8.CategoryName);
            Console.WriteLine("___________________________________________________________________________________________");
            ServicedProducts serviced1 = new ServicedProducts(1, 1, "1973 Usulu Corba Dana Incik Eti, Ilikli Kemik Suyu, Kirmizi Mercimek, Sarimsak ve Sirke", 25.01);
            ServicedProducts serviced2 = new ServicedProducts(2, 1, "Kelle Paca Corbasi                         ", 25.01);
            ServicedProducts serviced3 = new ServicedProducts(3, 1, "Sebzeli Tavuk Suyu Corbasi                 ", 15.01);
            ServicedProducts serviced4 = new ServicedProducts(4, 1, "Mercimek Corbasi                           ", 12.01);
            ServicedProducts serviced5 = new ServicedProducts(5, 2, "Porsiyon Doner 130 gr                      ", 35.01);
            ServicedProducts serviced6 = new ServicedProducts(6, 2, "Pilav Ustu Doner 130 gr                    ", 40.01);
            ServicedProducts serviced7 = new ServicedProducts(7, 2, "Fasulyeli Pilav Ustu Doner 130 gr          ", 40.01);
            ServicedProducts serviced8 = new ServicedProducts(8, 2, "Durum Doner 90 gr                          ", 25.01);
            ServicedProducts serviced9 = new ServicedProducts(9, 2, "Ekmek Arasi Doner 90 gr                    ", 25.01);
            ServicedProducts serviced10 = new ServicedProducts(10, 2, "Tombik Doner 130 gr                      ", 35.01);
            ServicedProducts serviced11 = new ServicedProducts(11, 2, "1973 Usulu Doner Durum 130 gr            ", 35.01);
            ServicedProducts serviced12 = new ServicedProducts(12, 2, "Uc Ceyrek Ekmek Arasi Doner 130 gr       ", 35.01);
            ServicedProducts serviced13 = new ServicedProducts(13, 3, "Izgara Antrikot                          ", 55.01);
            ServicedProducts serviced14 = new ServicedProducts(14, 3, "Izgara Kofte                             ", 30.01);
            ServicedProducts serviced15 = new ServicedProducts(15, 3, "Pilav Ustu Izgara Kofte                  ", 35.01);
            ServicedProducts serviced16 = new ServicedProducts(16, 3, "Begendili Izgara Kofte                   ", 40.01);
            ServicedProducts serviced17 = new ServicedProducts(17, 3, "Tahinli Piyazli Izgara Kofte             ", 40.01);
            ServicedProducts serviced18 = new ServicedProducts(18, 3, "Pureli Izgara Kofte                      ", 40.01);
            ServicedProducts serviced19 = new ServicedProducts(19, 3, "Ekmek Arasi Izgara Kofte                 ", 20.01);
            ServicedProducts serviced20 = new ServicedProducts(20, 4, "Kuru Fasulye                             ", 20.01);
            ServicedProducts serviced21 = new ServicedProducts(21, 4, "Tas Kebabi                               ", 30.01);
            ServicedProducts serviced22 = new ServicedProducts(22, 4, "Ankara Tava                              ", 38.01);
            ServicedProducts serviced23 = new ServicedProducts(23, 4, "Hunkar Begendi                           ", 38.01);
            ServicedProducts serviced24 = new ServicedProducts(24, 4, "Antep Usulu Alinazik                     ", 45.01);
            ServicedProducts serviced25 = new ServicedProducts(25, 4, "Asci Tabagi                              ", 50.01);
            ServicedProducts serviced26 = new ServicedProducts(26, 4, "Cat Cat Kebabi                           ", 38.01);
            ServicedProducts serviced27 = new ServicedProducts(27, 4, "Eksili Kofte                             ", 25.01);
            ServicedProducts serviced28 = new ServicedProducts(28, 4, "Izmir Kofte                              ", 25.01);
            ServicedProducts serviced29 = new ServicedProducts(29, 4, "Et Sote                                  ", 30.01);
            ServicedProducts serviced30 = new ServicedProducts(30, 4, "Etli Kuru Fasulye                        ", 30.01);
            ServicedProducts serviced31 = new ServicedProducts(31, 4, "Etli Yaprak Sarma                        ", 30.01);
            ServicedProducts serviced32 = new ServicedProducts(32, 4, "Etli Beyaz Lahana Sarmasi                ", 30.01);
            ServicedProducts serviced33 = new ServicedProducts(33, 4, "Etli Karalahana Sarmasi                  ", 30.01);
            ServicedProducts serviced34 = new ServicedProducts(34, 4, "Karisik Etli Dolma Tabagi                ", 32.01);
            ServicedProducts serviced35 = new ServicedProducts(35, 4, "Patlican Musakka                         ", 25.01);
            ServicedProducts serviced36 = new ServicedProducts(36, 4, "Pureli Kebap                             ", 38.01);
            ServicedProducts serviced37 = new ServicedProducts(37, 4, "Pilav Ustu Trabzon Kavurma 180 gr        ", 52.01);
            ServicedProducts serviced38 = new ServicedProducts(38, 4, "Bulgur ve Pirinç Pilavi                  ", 10.01);
            ServicedProducts serviced39 = new ServicedProducts(39, 5, "Domatesli Etli Spaghetti                 ", 42.01);
            ServicedProducts serviced40 = new ServicedProducts(40, 5, "Kremali Etli Spaghetti                   ", 42.01);
            ServicedProducts serviced41 = new ServicedProducts(41, 5, "Kiymali Domatesli Spaghetti              ", 38.01);
            ServicedProducts serviced42 = new ServicedProducts(42, 6, "Coban Salata                             ", 25.01);
            ServicedProducts serviced43 = new ServicedProducts(43, 6, "Tahinli Piyaz                            ", 28.01);
            ServicedProducts serviced44 = new ServicedProducts(44, 6, "Ton Balikli Coban Salata                 ", 30.01);
            ServicedProducts serviced45 = new ServicedProducts(45, 6, "Cacik                                    ", 10.01);
            ServicedProducts serviced46 = new ServicedProducts(46, 7, "Findikli Firin Sutlac                    ", 14.01);
            ServicedProducts serviced47 = new ServicedProducts(47, 7, "Kemalpasa Tatlisi                        ", 12.01);
            ServicedProducts serviced48 = new ServicedProducts(48, 7, "Sekerpare Tatlisi                        ", 18.01);
            ServicedProducts serviced49 = new ServicedProducts(49, 7, "Kabak Tatlisi                            ", 18.01);
            ServicedProducts serviced50 = new ServicedProducts(50, 8, "Ayran                                    ", 5.01);
            ServicedProducts serviced51 = new ServicedProducts(51, 8, "Ozerhisar Cam Sise Ayran                 ", 7.01);
            ServicedProducts serviced52 = new ServicedProducts(52, 8, "Meyve Hosafi El Yapimi Tanesiz Komposto  ", 12.01);
            ServicedProducts serviced53 = new ServicedProducts(53, 8, "Coca Cola                                ", 7.51);
            ServicedProducts serviced54 = new ServicedProducts(54, 8, "Coca Cola Zero                           ", 7.51);
            ServicedProducts serviced55 = new ServicedProducts(55, 8, "Sprite                                   ", 7.51);
            ServicedProducts serviced56 = new ServicedProducts(56, 8, "Fuse Tea                                 ", 7.51);
            ServicedProducts serviced57 = new ServicedProducts(57, 8, "Fanta                                    ", 7.51);
            ServicedProducts serviced58 = new ServicedProducts(58, 8, "Cappy Meyve Suyu                         ", 7.51);
            ServicedProducts serviced59 = new ServicedProducts(59, 8, "Salgam Suyu                              ", 7.51);
            ServicedProducts serviced60 = new ServicedProducts(60, 8, "Ayran 1lt                                ", 10.01);
            ServicedProducts serviced61 = new ServicedProducts(61, 8, "Coca Cola 1lt                            ", 10.01);
            Console.WriteLine("___________________________________________________________________________________________");
            Console.WriteLine("serviced1 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced1.Id, serviced1.CategoryId, serviced1.ServicedName, serviced1.Price);
            Console.WriteLine("serviced2 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced2.Id, serviced2.CategoryId, serviced2.ServicedName, serviced2.Price);
            Console.WriteLine("serviced3 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced3.Id, serviced3.CategoryId, serviced3.ServicedName, serviced3.Price);
            Console.WriteLine("serviced4 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced4.Id, serviced4.CategoryId, serviced4.ServicedName, serviced4.Price);
            Console.WriteLine("serviced5 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced5.Id, serviced5.CategoryId, serviced5.ServicedName, serviced5.Price);
            Console.WriteLine("serviced6 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced6.Id, serviced6.CategoryId, serviced6.ServicedName, serviced6.Price);
            Console.WriteLine("serviced7 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced7.Id, serviced7.CategoryId, serviced7.ServicedName, serviced7.Price);
            Console.WriteLine("serviced8 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced8.Id, serviced8.CategoryId, serviced8.ServicedName, serviced8.Price);
            Console.WriteLine("serviced9 Id = {0} CategoryId = {1} ServicedName = {2} and Price = {3}", serviced9.Id, serviced9.CategoryId, serviced9.ServicedName, serviced9.Price);
            Console.WriteLine("___________________________________________________________________________________________");
            Console.WriteLine("serviced9 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced9.Id, serviced9.CategoryId, serviced9.ServicedName, serviced9.Price);
            Console.WriteLine("serviced8 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced8.Id, serviced8.CategoryId, serviced8.ServicedName, serviced8.Price);
            Console.WriteLine("serviced7 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced7.Id, serviced7.CategoryId, serviced7.ServicedName, serviced7.Price);
            Console.WriteLine("serviced6 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced6.Id, serviced6.CategoryId, serviced6.ServicedName, serviced6.Price);
            Console.WriteLine("serviced5 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced5.Id, serviced5.CategoryId, serviced5.ServicedName, serviced5.Price);
            Console.WriteLine("serviced4 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced4.Id, serviced4.CategoryId, serviced4.ServicedName, serviced4.Price);
            Console.WriteLine("serviced3 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced3.Id, serviced3.CategoryId, serviced3.ServicedName, serviced3.Price);
            Console.WriteLine("serviced2 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced2.Id, serviced2.CategoryId, serviced2.ServicedName, serviced2.Price);
            Console.WriteLine("serviced1 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced1.Id, serviced1.CategoryId, serviced1.ServicedName, serviced1.Price);
            Console.WriteLine("serviced10 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced10.Id, serviced10.CategoryId, serviced10.ServicedName, serviced10.Price);
            Console.WriteLine("serviced11 Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}", serviced11.Id, serviced11.CategoryId, serviced11.ServicedName, serviced11.Price);
            Console.WriteLine("___________________________________________________________________________________________");
            string message = "Id = {0} CategoryId = {1} Price = {3} and ServicedName = {2}";
            Console.WriteLine("serviced12 " + message, serviced12.Id, serviced12.CategoryId, serviced12.ServicedName, serviced12.Price);
            Console.WriteLine("serviced13 " + message, serviced13.Id, serviced13.CategoryId, serviced13.ServicedName, serviced13.Price);
            Console.WriteLine("serviced14 " + message, serviced14.Id, serviced14.CategoryId, serviced14.ServicedName, serviced14.Price);
            Console.WriteLine("serviced15 " + message, serviced15.Id, serviced15.CategoryId, serviced15.ServicedName, serviced15.Price);
            Console.WriteLine("serviced16 " + message, serviced16.Id, serviced16.CategoryId, serviced16.ServicedName, serviced16.Price);
            Console.WriteLine("serviced17 " + message, serviced17.Id, serviced17.CategoryId, serviced17.ServicedName, serviced17.Price);
            Console.WriteLine("serviced18 " + message, serviced18.Id, serviced18.CategoryId, serviced18.ServicedName, serviced18.Price);
            Console.WriteLine("serviced19 " + message, serviced19.Id, serviced19.CategoryId, serviced19.ServicedName, serviced19.Price);
            Console.WriteLine("serviced20 " + message, serviced20.Id, serviced20.CategoryId, serviced20.ServicedName, serviced20.Price);
            Console.WriteLine("serviced21 " + message, serviced21.Id, serviced21.CategoryId, serviced21.ServicedName, serviced21.Price);
            Console.WriteLine("serviced22 " + message, serviced22.Id, serviced22.CategoryId, serviced22.ServicedName, serviced22.Price);
            Console.WriteLine("serviced23 " + message, serviced23.Id, serviced23.CategoryId, serviced23.ServicedName, serviced23.Price);
            Console.WriteLine("serviced24 " + message, serviced24.Id, serviced24.CategoryId, serviced24.ServicedName, serviced24.Price);
            Console.WriteLine("serviced25 " + message, serviced25.Id, serviced25.CategoryId, serviced25.ServicedName, serviced25.Price);
            Console.WriteLine("serviced26 " + message, serviced26.Id, serviced26.CategoryId, serviced26.ServicedName, serviced26.Price);
            Console.WriteLine("serviced27 " + message, serviced27.Id, serviced27.CategoryId, serviced27.ServicedName, serviced27.Price);
            Console.WriteLine("serviced28 " + message, serviced28.Id, serviced28.CategoryId, serviced28.ServicedName, serviced28.Price);
            Console.WriteLine("serviced29 " + message, serviced29.Id, serviced29.CategoryId, serviced29.ServicedName, serviced29.Price);
            Console.WriteLine("serviced30 " + message, serviced30.Id, serviced30.CategoryId, serviced30.ServicedName, serviced30.Price);
            Console.WriteLine("serviced31 " + message, serviced31.Id, serviced31.CategoryId, serviced31.ServicedName, serviced31.Price);
            Console.WriteLine("___________________________________________________________________________________________");

            string[] ServicedProducts =
            {
                "Etli Beyaz Lahana Sarmasi",
                "Etli Karalahana Sarmasi",
                "Karisik Etli Dolma Tabagi",
                "Patlican Musakka",
                "Pureli Kebap",
                "Pilav Ustu Trabzon Kavurma 180 gr",
                "Bulgur ve Pirinç Pilavi",
                "Domatesli Etli Spaghetti",
                "Kremali Etli Spaghetti",
                "Kiymali Domatesli Spaghetti",
                "Coban Salata",
                "Tahinli Piyaz",
                "Ton Balikli Coban Salata",
                "Cacik",
                "Findikli Firin Sutlac",
                "Kemalpasa Tatlisi",
                "Sekerpare Tatlisi",
                "Kabak Tatlisi",
                "Ayran",
                "Ozerhisar Cam Sise Ayran",
                "Meyve Hosafi El Yapimi Tanesiz Komposto",
                "Coca Cola",
                "Coca Cola Zero",
                "Sprite",
                "Fuse Tea",
                "Fanta",
                "Cappy Meyve Suyu",
                "Salgam Suyu",
                "Ayran 1lt",
                "Coca Cola 1lt"
            };
            foreach (var item in ServicedProducts)
            {
                Console.WriteLine(item);
            }
            Console.WriteLine("___________________________________________________________________________________________");

            List<Meal> meals = new List<Meal>();
            meals.Add(new Meal() { MealId = 1, Category = " Corbalar           ", Price = 25.01, MealName = "1973 Usulu Corba Dana Incik Eti,Ilikli Kemik Suyu,Kirmizi Mercimek,Sarimsak ve Sirke" });
            meals.Add(new Meal() { MealId = 2, Category = " Corbalar           ", Price = 25.01, MealName = "Kelle Paca Corbasi" });
            meals.Add(new Meal() { MealId = 3, Category = " Corbalar           ", Price = 15.01, MealName = "Sebzeli Tavuk Suyu Corbasi" });
            meals.Add(new Meal() { MealId = 4, Category = " Corbalar           ", Price = 12.01, MealName = "Mercimek Corbasi" });
            meals.Add(new Meal() { MealId = 5, Category = " Karadeniz Et Doneri", Price = 35.01, MealName = "Porsiyon Doner 130 gr" });
            meals.Add(new Meal() { MealId = 6, Category = " Karadeniz Et Doneri", Price = 40.01, MealName = "Pilav Ustu Doner 130 gr" });
            meals.Add(new Meal() { MealId = 7, Category = " Karadeniz Et Doneri", Price = 40.01, MealName = "Fasulyeli Pilav Ustu Doner 130 gr" });
            meals.Add(new Meal() { MealId = 8, Category = " Karadeniz Et Doneri", Price = 25.01, MealName = "Durum Doner 90 gr" });
            meals.Add(new Meal() { MealId = 9, Category = " Karadeniz Et Doneri", Price = 25.01, MealName = "Ekmek Arasi Doner 90 gr" });
            meals.Add(new Meal() { MealId = 10, Category = "Karadeniz Et Doneri", Price = 35.01, MealName = "Tombik Doner 130 gr" });
            meals.Add(new Meal() { MealId = 11, Category = "Karadeniz Et Doneri", Price = 35.01, MealName = "1973 Usulu Doner Durum 130 gr" });
            meals.Add(new Meal() { MealId = 12, Category = "Karadeniz Et Doneri", Price = 35.01, MealName = "Uc Ceyrek Ekmek Arasi Doner 130 gr" });
            meals.Add(new Meal() { MealId = 13, Category = "Izgaralar          ", MealName = "Izgara Antrikot",                    Price = 55.01});
            meals.Add(new Meal() { MealId = 14, Category = "Izgaralar          ", MealName = "Izgara Kofte",                       Price = 30.01});
            meals.Add(new Meal() { MealId = 15, Category = "Izgaralar          ", MealName = "Pilav Ustu Izgara Kofte",            Price = 35.01});
            meals.Add(new Meal() { MealId = 16, Category = "Izgaralar          ", MealName = "Begendili Izgara Kofte",             Price = 40.01});
            meals.Add(new Meal() { MealId = 17, Category = "Izgaralar          ", MealName = "Tahinli Piyazli Izgara Kofte",       Price = 40.01});
            meals.Add(new Meal() { MealId = 18, Category = "Izgaralar          ", MealName = "Pureli Izgara Kofte",                Price = 40.01});
            meals.Add(new Meal() { MealId = 19, Category = "Izgaralar          ", MealName = "Ekmek Arasi Izgara Kofte",           Price = 20.01});
            meals.Add(new Meal() { MealId = 20, Category = "Ana Yemekler       ", MealName = "Kuru Fasulye",                       Price = 20.01});
            meals.Add(new Meal() { MealId = 21, Category = "Ana Yemekler       ", MealName = "Tas Kebabi",                         Price = 30.01});
            meals.Add(new Meal() { MealId = 22, Category = "Ana Yemekler       ", MealName = "Ankara Tava",                        Price = 38.01});
            meals.Add(new Meal() { MealId = 23, Category = "Ana Yemekler       ", MealName = "Hunkar Begendi",                     Price = 38.01});
            meals.Add(new Meal() { MealId = 24, Category = "Ana Yemekler       ", MealName = "Antep Usulu Alinazik",               Price = 45.01});
            meals.Add(new Meal() { MealId = 25, Category = "Ana Yemekler       ", MealName = "Asci Tabagi",                        Price = 50.01});
            meals.Add(new Meal() { MealId = 26, Category = "Ana Yemekler       ", MealName = "Cat Cat Kebabi",                     Price = 38.01});
            meals.Add(new Meal() { MealId = 27, Category = "Ana Yemekler       ", MealName = "Eksili Kofte",                       Price = 25.01});
            meals.Add(new Meal() { MealId = 28, Category = "Ana Yemekler       ", MealName = "Izmir Kofte",                        Price = 25.01});
            meals.Add(new Meal() { MealId = 29, Category = "Ana Yemekler       ", MealName = "Et Sote",                            Price = 30.01});
            meals.Add(new Meal() { MealId = 30, Category = "Ana Yemekler       ", MealName = "Etli Kuru Fasulye",                  Price = 30.01});
            meals.Add(new Meal() { MealId = 31, Category = "Ana Yemekler       ", MealName = "Etli Yaprak Sarma",                  Price = 30.01});
            meals.Add(new Meal() { MealId = 32, Category = "Ana Yemekler       ", MealName = "Etli Beyaz Lahana Sarmasi",          Price = 30.01});
            meals.Add(new Meal() { MealId = 33, Category = "Ana Yemekler       ", MealName = "Etli Karalahana Sarmasi",            Price = 30.01});
            meals.Add(new Meal() { MealId = 34, Category = "Ana Yemekler       ", MealName = "Karisik Etli Dolma Tabagi",          Price = 32.01});
            meals.Add(new Meal() { MealId = 35, Category = "Ana Yemekler       ", MealName = "Patlican Musakka",                   Price = 25.01});
            meals.Add(new Meal() { MealId = 36, Category = "Ana Yemekler       ", MealName = "Pureli Kebap",                       Price = 38.01});
            meals.Add(new Meal() { MealId = 37, Category = "Ana Yemekler       ", MealName = "Pilav Ustu Trabzon Kavurma 180 gr",  Price = 52.01});
            meals.Add(new Meal() { MealId = 38, Category = "Ana Yemekler       ", MealName = "Bulgur ve Pirinç Pilavi",            Price = 10.01 });

            Console.WriteLine();
            foreach (Meal aMeal in meals)
            {
                Console.WriteLine(aMeal);
            }
            Console.WriteLine("___________________________________________________________________________________________");

            // Create a list of parts.
            List<Part> parts = new List<Part>();

            // Add parts to the list.
            parts.Add(new Part() { PartName = "crank arm", PartId = 1234 });
            parts.Add(new Part() { PartName = "chain ring", PartId = 1334 });
            parts.Add(new Part() { PartName = "regular seat", PartId = 1434 });
            parts.Add(new Part() { PartName = "banana seat", PartId = 1444 });
            parts.Add(new Part() { PartName = "cassette", PartId = 1534 });
            parts.Add(new Part() { PartName = "shift lever", PartId = 1634 });

            // Write out the parts in the list. This will call the overridden ToString method
            // in the Part class.
            Console.WriteLine();
            foreach (Part aPart in parts)
            {
                Console.WriteLine(aPart);
            }
        }       
    }
}

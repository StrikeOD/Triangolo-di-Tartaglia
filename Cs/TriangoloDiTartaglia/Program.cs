using System;

namespace TriangoloDiTartaglia
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            InitTriangle();
        }

        public static void InitTriangle()
        {
            Console.Write("Inserire il numero di righe desiderate per il triangolo di Tartaglia: ");
            int righe = Convert.ToUInt16(Console.ReadLine());
            uint[][] triangle = new uint[righe][];
            for (uint riga = 0; riga < righe; riga++) {
                triangle[riga] = new uint[riga + 1];
                triangle[riga][0] = 1;
                triangle[riga][riga] = 1;

                for (uint colonna = 1; colonna < riga; colonna++) {
                    triangle[riga][colonna] = triangle[riga - 1][colonna - 1] + triangle[riga - 1][colonna];
                }
            }
            for (int riga = 0; riga < righe; riga++) {
                for (int colonna = 0; colonna <= riga; colonna++) {
                    Console.Write(triangle[riga][colonna] + " ");
                }
                Console.WriteLine();
            }

        }

        
    }
}
    
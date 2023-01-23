
    /**
    * Tester for Maman 14
    */
    public class Maman14StudentTester
    {
        public static void main (String[] args)
        {
            //-----------------------Company---------------------
            System.out.println("\n-----Testing Company Class:-----\n"); 
        
            //Test Constructor()
            Company comp1 = new Company();
            System.out.println("Testing default constructor and printing using the toString() method:");
            System.out.println(comp1);
        
            //Test addRent()
            boolean success;
            System.out.println("\nTesting addRent - adding one Rent");
        
            //adding one rent
            success = comp1.addRent("David Cohen", new Car(1122233,'B',"Mercedes", false ), new Date(2,7,2018), new Date(6,7,2018));
            if(success == false)  
                System.out.println("Error in addRnt: failed to add one rent to an empty list.");
            else
                System.out.print("Success to add one rent to an empty list (print below):\n"+comp1);
        
            //Test toString()            
            System.out.println("\nTesting toString after adding 4 more Rent \norder of rents is important - early pickDate should be first:");
            comp1.addRent("Lior Cohen", new Car(7654321, 'B', "Toyota", true ), new Date(8,8,2018), new Date(10,8,2018));
            comp1.addRent("Moshe Levy", new Car(1000001,'C',"Citroen", false ), new Date(2,7,2018), new Date(17,7,2018));
            comp1.addRent("Ron Balon", new Car(1111111,'C',"Renault", true ), new Date(2,7,2018), new Date(9,7,2018));
            comp1.addRent("Israel Israeli", new Car(1234567, 'A', "Mazda", true ), new Date(2,8,2017), new Date(11,8,2017));
            System.out.println(comp1);
        
            //test getSumOfPrices() -  should be 6072
            System.out.println("\nTesting getSumOfPrices():");
            System.out.println("The sum of all prices of rents in this company is: " + comp1.getSumOfPrices());
        
            //test getSumOfDays() -  should be 42
            System.out.println("\nTesting getSumOfDays():");
            System.out.println("The total sum of rent days in this company is: " + comp1.getSumOfDays());
        
            //test averageRent() -  should be 8.4
            System.out.println("\nTesting averageRent():");
            System.out.println("The average rent duration in this company is: " + comp1.averageRent());        
        
            //test lastCarRent()  -  should be 
            System.out.println("\nTesting lastCarRent():");
            Car lastToComp = new Car(1000001,'C',"Citroen", false );
            Car last = comp1.lastCarRent();
            System.out.println("The car in the company that its return date is the latest:\n" + comp1.lastCarRent());     
            System.out.println("Where it should be:\nid:7654321 type:B brand:Toyota gear:manual");
        
            //test longestRent()  -  should be 16
            System.out.println("\nTesting longestRent():");
            Rent longRent = comp1.longestRent();
            System.out.println("The longest rent duration in this company is: " + longRent.howManyDays());       
        
            //test mostCommonRate() -  should be 'C'
            System.out.println("\nTesting mostCommonRate():");
            System.out.println("The most common rate in this company is: " + comp1.mostCommonRate()); 
        
            //test removeRent(Date d) - removing one rent 
            System.out.println("\nTesting removeRent(Date d):");
            success = comp1.removeRent(new Date(9,7,2018));             
            if(success == false)  
                System.out.println("Error in removeRent: failed to remove a rent that exists in the list.");
            else
                System.out.println("Succeeded removing a rent from the list (print below):\n");
            System.out.println("after removing a rent from the list (Ron Balon should be removed):");
            System.out.println(comp1);
            System.out.println("\n-----Finish testing Company Class-----\n");
            
            System.out.println("\n-----Testing MagicSquare Class:-----\n");
            System.out.println("using the matrix from the example:");
            System.out.println("{2,9,4}\n{7,5,3}\n{6,1,8}");
            int[][] mat1 = { {2,9,4},{7,5,3},{6,1,8}};
            System.out.println("Testing the sumRow method for row 1 (should return 15):");                
            System.out.println(MagicSquare.sumRow(mat1,1));                
            System.out.println("Testing the sumCol method for col 0 (should return 15):");                
            System.out.println(MagicSquare.sumRow(mat1,0));                
            System.out.println("Testing the sumPrimaryDiag method (should return 15):");                
            System.out.println(MagicSquare.sumPrimaryDiag(mat1));
            System.out.println("Testing the sumSecondaryDiag method (should return 15):");                
            System.out.println(MagicSquare.sumSecondaryDiag(mat1));
            System.out.println("Testing the isMagicSquare method (should return true):");                
            System.out.println(MagicSquare.isMagicSquare(mat1));                
            int[][] mat2 = {{2,9,4},{7,5,2}, {6,1,8}}; // not a magic square
            int[][] mat3 = {{2,9,4,1},{7,5,3,2}, {6,1,8,3}}; // not a magic square
            System.out.println("{2,9,4}\n{7,5,2}\n{6,1,8}");
            if (MagicSquare.isMagicSquare(mat2))
                System.out.println("This is a magic square! \nWhere it is be: \nThis is not a magic square!");
            else
                System.out.println("This is not a magic square! \nWhere it is be: \nThis is not a magic square!");            
            System.out.println("{2,9,4,1}\n{7,5,3,2}\n{6,1,8,3}");
            if (MagicSquare.isMagicSquare(mat3))
            System.out.println("This is a magic square! \nWhere it is be: \nThis is not a magic square!");
            else
                System.out.println("This is not a magic square! \nWhere it is be: \nThis is not a magic square!");
            System.out.println("\n-----Finish testing Magic Square Class-----\n");                
    }
}   
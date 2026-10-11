package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentSize ;
    int currentNumber ;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        currentNumber=list.length;
        currentSize=list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize (){
        currentSize *=2;
        int[] doubleList= new int[currentSize];
        for (int i=0; i<list.length; i++){
            doubleList[i]=list[i];
        }
        list= doubleList;
    }
    public void addElement(int newVal){
        if (currentNumber>=currentSize){
            increaseSize();
        }
        list[currentNumber]= newVal;
        currentNumber++;
    }
    public void removeFirst(int newVal){
        boolean removed = false ;
        int index =0 ;
        for (int i=0 ; i<list.length ; i++){
            if(list[i]== newVal){
                removed=true ;
                index = i ;
            }
        }
        if(removed){
            currentNumber-- ;
            for(int i = index ; i<list.length-1 ; i++ ){
                list[i]=list[i+1];
            }
            list[list.length-1]=0;
        }
    }
    public void removeAll(int newVal){
        int previousNumber ;
        do{
            previousNumber  =currentNumber ;
            removeFirst(newVal);
        }while (previousNumber!=currentNumber);
    }

}
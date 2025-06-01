public class AppendableSafeArray extends BasicSafeArray {

     AppendableSafeArray(int size){
       super(size);

    }
    public BasicSafeArray appArray(int append){
        AppendableSafeArray newArray= new AppendableSafeArray(size+1);
        for (int i=0; i<size; i++){
            newArray.array[i]=array[i];
        }
        newArray.array[size]=append;

        return newArray;
    }

}
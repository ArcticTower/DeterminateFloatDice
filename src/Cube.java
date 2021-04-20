

public class Cube {
    private int d;
    private float value;


    public Cube(int max_d){
        this.d=max_d;
    }

    public void roll(float f){
    this.value = f;
    }

    public int getValue(){
        float delta = (float) 1/(float) d;
        int res =1;
        float counter =delta;
        for(int i =0;i<d;++i){
            if(value<=counter){
                break;
            }
            res++;
            counter+=delta;
        }
        return res;
    }
}

public class mcd {

    public static int mcd(int x, int y)
    {
        int mcd;
        if(x==y)
        {
            mcd=x;
        }
        else {
            if(x>y)
            {
                mcd =mcd(x-y,y);

            }
            else {
                mcd=mcd(x,y-x);
            }
        }
    return mcd;
    }

}

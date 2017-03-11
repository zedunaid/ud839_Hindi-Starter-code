package com.example.android.miwok;

/**
 * Created by Abc on 04/03/2017.
 */
public class Words {
     private String mEngTrans;
    private String mHindiTrans;
    private int mImageId;
    public Words(String EngTrans,String MiwokTrans )
    {
        mEngTrans=EngTrans;
        mHindiTrans=MiwokTrans;
        mImageId=0;
    }
    public Words(String EngTrans,String MiwokTrans,int ImageId )
    {
        mEngTrans=EngTrans;
        mHindiTrans=MiwokTrans;
        mImageId=ImageId;
    }
    public String getEnglishTranslation()
    {
      return mEngTrans;
    }

    public String getHindiTranslation()
    {
       return mHindiTrans;
    }

    public int getHindiImage(){ return mImageId;   }
}

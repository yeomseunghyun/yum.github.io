package com.example.realp;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CB_ReadRequest extends StringRequest {
    final static  private String URL="http://tmdgus95p.dothome.co.kr/CoBoardRead.php";
    private Map<String,String> map;

    public CB_ReadRequest(int cNumber, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("cNumber",cNumber+"");
    }

    @Override
    protected Map<String,String> getParams() throws AuthFailureError {
        return map;
    }

}

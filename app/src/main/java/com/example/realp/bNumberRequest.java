package com.example.realp;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class bNumberRequest extends StringRequest {
    //서버 URL 설정(php 파일 연동)
    final static private String URL = "http://tmdgus95p.dothome.co.kr/getBNumber.php";
    private Map<String, String> map;

    public bNumberRequest(Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        map = new HashMap<>();
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}

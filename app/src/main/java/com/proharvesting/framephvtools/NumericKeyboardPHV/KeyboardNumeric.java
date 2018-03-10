package com.proharvesting.framephvtools.NumericKeyboardPHV;

public class KeyboardNumeric {
    private boolean begining=true;
    private String strTotal;
    private int total;
    private int minValue;
    private int max;

    public KeyboardNumeric(int max) {
        strTotal="1";
        minValue=1;
        this.total = minValue;
        this.max = max;
        begining=true;
    }

    public int getMinValue(){
        return minValue;
    }
    public int getTotal(){
        return total;
    }

    public int click1(){ return add(1); }
    public int click2(){ return add(2); }
    public int click3(){ return add(3); }
    public int click4(){ return add(4); }
    public int click5(){ return add(5); }
    public int click6(){ return add(6); }
    public int click7(){ return add(7); }
    public int click8(){ return add(8); }
    public int click9(){ return add(9); }
    public int click0(){ return add(0); }
    public int clickBack(){ return back(); }

    private int back(){
        if(strTotal.length()>1){
            strTotal = strTotal.substring(0,strTotal.length()-1);
            total = Integer.parseInt(strTotal);
        }
        else{
            strTotal = "1";
            total = Integer.parseInt(strTotal);
            begining=true;
        }
        return total;
    }

    private int add(int value){
        if(begining){
            begining=false;
            setFirstTotal(value);
        }
        else{
            setTotal(value);
        }
        return total;
    }

    private boolean setTotal(int value ){
        if((Integer.parseInt(strTotal+value))<=max){
            strTotal+=value;
            total = Integer.parseInt(strTotal);
            return true;
        }
        else{
            return  false;
        }
    }

    private boolean setFirstTotal(int value ){
        if((Integer.parseInt(""+value))<=max){
            strTotal=""+value;
            total = Integer.parseInt(strTotal);
            return true;
        }
        else{
            return  false;
        }
    }

    private void init(){
        total=minValue;
    }
}

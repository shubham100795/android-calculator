package com.example.android.myproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button deleteview=(Button)findViewById(R.id.del);
        deleteview.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                str="";
                TextView text=(TextView)findViewById(R.id.textview);
                text.setText(str);
                dot=true;
                return true;
            }
        });
    }

    Boolean dot=true;
    String str="";
    Double result;
    Boolean evaluated=false;
    public void fseven(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"7";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "7";
            text.setText(str);
        }

    }
    public void feight(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"8";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "8";
            text.setText(str);
        }
    }
    public void fnine(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"9";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "9";
            text.setText(str);
        }
    }
    public void ffour(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"4";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "4";
            text.setText(str);
        }
    }
    public void ffive(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"5";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "5";
            text.setText(str);
        }
    }
    public void fsix(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"6";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "6";
            text.setText(str);
        }
    }
    public void fone(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"1";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "1";
            text.setText(str);
        }
    }
    public void ftwo(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"2";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "2";
            text.setText(str);
        }
    }
    public void fthree(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"3";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "3";
            text.setText(str);
        }
    }
    public void reset(View view)
    {
        str="";
        TextView text=(TextView)findViewById(R.id.textview);
        text.setText(str);
        dot=true;
        evaluated=false;
    }
    public void fzero(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(evaluated==true)
        {
            str="";
            str=str+"0";
            text.setText(str);
            evaluated=false;
            dot=true;
        }
        else {
            str = str + "0";
            text.setText(str);
        }
    }
    public void fperiod(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(dot==true) {
            str = str + ".";
            text.setText(str);
            dot=false;
        }
        else
        {
            return;
        }
    }
    public void fplus(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="")
        {
            return;
        }
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        char c=str.charAt(str.length()-1);
        if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            str=str.substring(0, str.length() - 1)+"+";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
        else{
        str=str+"+";
        text.setText(str);
            dot=true;
            evaluated=false;
        }
    }
    public void fminus(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="")
        {
            return;
        }
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        char c=str.charAt(str.length()-1);
        if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            str=str.substring(0, str.length() - 1)+"-";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
        else{
            str=str+"-";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
    }
    public void fmulti(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="")
        {
            return;
        }
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        char c=str.charAt(str.length()-1);
        if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            str=str.substring(0, str.length() - 1)+"*";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
        else{
            str=str+"*";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
    }
    public void fdivide(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="")
        {
            return;
        }
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        char c=str.charAt(str.length()-1);
        if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            str=str.substring(0, str.length() - 1)+"/";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
        else{
            str=str+"/";
            text.setText(str);
            dot=true;
            evaluated=false;
        }
    }
    public void fequal(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str==""||str.length()==1)
        {
            return;
        }
        char c=str.charAt(str.length()-1);
        char p=str.charAt(str.length()-2);
        if(c=='.'&& (p=='+'||p=='-'||p=='*'||p=='/'))
        {
            str="Invalid Expression";
            text.setText(str);
        }
        else if(c=='+'||c=='-'||c=='*'||c=='/')
        {
            str="Invalid Expression";
            text.setText(str);
        }
        else if(str=="Infinity") {
            str="Infinity";
            text.setText(str);
        }
        else if(str=="Invalid Expression") {
            str="Invalid Expression";
            text.setText(str);
        }
        else
        {
            DoubleEvaluator evaluator = new DoubleEvaluator();
            result = evaluator.evaluate(str);
            text.setText(result.toString());
            dot=false;
            evaluated=true;
        }
    }
    public void delete(View view)
    {
        TextView text=(TextView)findViewById(R.id.textview);
        str=text.getText().toString();
        if(str=="Infinity"||str=="Invalid Expression")
        {
            return;
        }
        if(str.length()<=1) {
            str="";
            text.setText(str);
        }
        else
        {
            if(str.charAt(str.length()-1)=='.')
            {
                str = str.substring(0, str.length() - 1);
                text.setText(str);
                dot=true;
            }
            else
            {
                str = str.substring(0, str.length() - 1);
                text.setText(str);
            }
        }
    }
}

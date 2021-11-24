package com.example.appquiz.classes;

import android.app.Application;

import com.example.appquiz.R;

import java.util.ArrayList;

public class GlobalVariables extends Application {
    private static ArrayList<Lesson> alphabetsArrayList = new ArrayList<>();
    private static ArrayList<Lesson> numbersArrayList = new ArrayList<>();
    private static ArrayList<Lesson> sensesArrayList = new ArrayList<>();
    private static ArrayList<Test> testArrayList = new ArrayList<>();

    public GlobalVariables(){
        addAlphabets();
        addNumbers();
        addSenses();
        addTest();
    }
    private void addTest(){
        Test t1 = new Test(R.drawable.a1,"one","two","one");
        Test t2 = new Test(R.drawable.w,"w","w","w");
        Test t3 = new Test(R.drawable.sight,"sight","smell","sight");
        Test t4 = new Test(R.drawable.hear,"hear","hear","smell");
        Test t5 = new Test(R.drawable.a5,"five","seven","five");
        Test t6= new Test(R.drawable.b,"b","D","B");
        Test t7 = new Test(R.drawable.m,"M","M","N");
        Test t8 = new Test(R.drawable.touch,"touch","smell","touch");
        Test t9 = new Test(R.drawable.a8,"eight","seven","eight");
        Test t10 = new Test(R.drawable.taste,"taste","taste","smell");

        testArrayList.add(t1);
        testArrayList.add(t2);
        testArrayList.add(t3);
        testArrayList.add(t4);
        testArrayList.add(t5);
        testArrayList.add(t6);
        testArrayList.add(t7);
        testArrayList.add(t8);
        testArrayList.add(t9);
        testArrayList.add(t10);

    }
    public ArrayList<Test> getTest(){
        return testArrayList;
    }
    private void addSenses(){
        Lesson s1 = new Lesson("Taste",R.drawable.taste);
        sensesArrayList.add(s1);
        Lesson s2 = new Lesson("Hearing",R.drawable.hear);
        sensesArrayList.add(s2);
        Lesson s3 = new Lesson("Sight",R.drawable.sight);
        sensesArrayList.add(s3);
        Lesson s4 = new Lesson("Smell",R.drawable.smell);
        sensesArrayList.add(s4);
        Lesson s5 = new Lesson("Touch",R.drawable.touch);
        sensesArrayList.add(s5);
    }
    public ArrayList<Lesson> getSenses(){
        return sensesArrayList;
    }
    private void addNumbers(){
        Lesson a1 = new Lesson("1",R.drawable.a1);
        numbersArrayList.add(a1);
        Lesson a2 = new Lesson("2",R.drawable.a2);
        numbersArrayList.add(a2);
        Lesson a3 = new Lesson("3",R.drawable.a3);
        numbersArrayList.add(a3);
        Lesson a4 = new Lesson("4",R.drawable.a4);
        numbersArrayList.add(a4);
        Lesson a5 = new Lesson("5",R.drawable.a5);
        numbersArrayList.add(a5);
        Lesson a6 = new Lesson("6",R.drawable.a6);
        numbersArrayList.add(a6);
        Lesson a7 = new Lesson("7",R.drawable.a7);
        numbersArrayList.add(a7);
        Lesson a8 = new Lesson("8",R.drawable.a8);
        numbersArrayList.add(a8);
        Lesson a9 = new Lesson("9",R.drawable.a9);
        numbersArrayList.add(a9);
        Lesson a10 = new Lesson("10",R.drawable.a10);
        numbersArrayList.add(a10);
    }
    public ArrayList<Lesson> getNumbers(){
        return numbersArrayList;
    }
    private void addAlphabets() {
        Lesson a = new Lesson("a", R.drawable.a);
        alphabetsArrayList.add(a);
        Lesson b = new Lesson("b", R.drawable.b);
        alphabetsArrayList.add(b);
        Lesson c = new Lesson("c", R.drawable.c);
        alphabetsArrayList.add(c);
        Lesson d = new Lesson("d", R.drawable.d);
        alphabetsArrayList.add(d);
        Lesson e = new Lesson("e", R.drawable.e);
        alphabetsArrayList.add(e);
        Lesson f = new Lesson("f", R.drawable.f);
        alphabetsArrayList.add(f);
        Lesson g = new Lesson("g", R.drawable.g);
        alphabetsArrayList.add(g);
        Lesson h = new Lesson("h", R.drawable.h);
        alphabetsArrayList.add(h);
        Lesson i = new Lesson("i", R.drawable.i);
        alphabetsArrayList.add(i);
        Lesson j = new Lesson("j", R.drawable.j);
        alphabetsArrayList.add(j);
        Lesson k = new Lesson("k", R.drawable.k);
        alphabetsArrayList.add(k);
        Lesson l = new Lesson("l", R.drawable.l);
        alphabetsArrayList.add(l);
        Lesson m = new Lesson("m", R.drawable.m);
        alphabetsArrayList.add(m);
        Lesson n = new Lesson("n", R.drawable.n);
        alphabetsArrayList.add(n);
        Lesson o = new Lesson("o", R.drawable.o);
        alphabetsArrayList.add(o);
        Lesson p = new Lesson("p", R.drawable.p);
        alphabetsArrayList.add(p);
        Lesson q = new Lesson("q", R.drawable.q);
        alphabetsArrayList.add(q);
        Lesson r = new Lesson("r", R.drawable.r);
        alphabetsArrayList.add(r);
        Lesson s = new Lesson("s", R.drawable.s);
        alphabetsArrayList.add(s);
        Lesson t = new Lesson("t", R.drawable.t);
        alphabetsArrayList.add(t);
        Lesson u = new Lesson("u", R.drawable.u);
        alphabetsArrayList.add(u);
        Lesson v = new Lesson("v", R.drawable.v);
        alphabetsArrayList.add(v);
        Lesson w = new Lesson("w", R.drawable.w);
        alphabetsArrayList.add(w);
        Lesson x = new Lesson("x", R.drawable.x);
        alphabetsArrayList.add(x);
        Lesson y = new Lesson("y", R.drawable.y);
        alphabetsArrayList.add(y);
        Lesson z = new Lesson("z", R.drawable.z);
        alphabetsArrayList.add(z);
    }
    public static ArrayList<Lesson> getAlphabets(){
        return alphabetsArrayList;
    }
}

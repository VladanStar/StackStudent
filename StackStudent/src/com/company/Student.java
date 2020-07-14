package com.company;

public class Student implements Comparable<Student> {
    private int indeks;
    private String ime;
    private String prezime;

    public Student() {
    }

    public Student(int indeks, String ime, String prezime) {
        this.indeks = indeks;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public int compareTo(Student student) {
        return Integer.valueOf(indeks).compareTo(student.getIndeks());
    }

    @Override
    public String toString() {
        return "Student{" +
                "indeks=" + indeks +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}

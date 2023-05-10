package main.java.com.Max_Kiriyak.AdditionalExamples.HashCode;

class User {
    private long id;
    private String name;
    private String email;


    @Override
    public int hashCode() {
        //return (int) id * name.hashCode() * email.hashCode();
        int hash = 7;
        hash = 31 * hash * (int) id;
        hash = 31 * hash * (name == null ? 0 : name.hashCode());
        hash = 31 * hash * (name == null ? 0 : email.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (this.getClass() != o.getClass()) return false;

        var user = (User) o;
        return this.id == user.id && (name.equals(user.name)) && (email.equals(user.email));

    }
}

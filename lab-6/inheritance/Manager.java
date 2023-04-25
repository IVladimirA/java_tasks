class Manager extends Human {
    Integer projectCount = 0;
    public String info() {
        return surname + " " + name + " " + projectCount;
    }
}
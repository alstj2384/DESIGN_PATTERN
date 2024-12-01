package ch05_singleton.solution.P5_2.Enum;

enum Triple {
    ALPHA, BETA, GAMMA;

    static Triple getInstance(String name){
        return valueOf(name);
    }

    @Override
    public String toString(){
        return "객체 : " + this.name();
    }
}

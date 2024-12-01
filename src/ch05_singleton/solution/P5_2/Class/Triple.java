package ch05_singleton.solution.P5_2.Class;

import java.util.Arrays;
import java.util.HashMap;

public class Triple {
    //단 3개의 인스턴스만을 생성해야함
    private static HashMap<String, Triple> map = new HashMap<>();
    static { // 정적 초기화 블럭으로 클래스 로드 시 한 번만 실행되도록 ㅎ ㅏㅁ
        String[] names = {"ALPHA", "BETA", "GAMMA"};
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }
    private String name;

    private Triple(){
    }
    private Triple(String name){
        this.name = name;
        System.out.println("Triple : " + name + " 인스턴스 생성");
    }

    public static Triple getInstance(String name){
        return map.get(name);
    }

    @Override
    public String toString(){
        return "객체 : " + this.name;
    }
}

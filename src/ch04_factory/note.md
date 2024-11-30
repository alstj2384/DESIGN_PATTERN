### 디자인 패턴을 사용해 클래스를 설계하면, 의도와 패턴 명칭을 잘 명시해야 한다
Template나 Factory 메서드는 하나의 클래스를 읽어서는 동작을 이해할 수 없다.

동작을 이해하려면 상위 클래스에서 뼈대를 확인한 후, 실제 구현 클래스를 살펴보아야 한다.\
이 과정에서 해당 관계가 어떤 목적과 의도로 만들어졌는지 적절히 기술되지 않으면 해당 클래스를 유지보수하는 사람이 의도와 다른 수정을 가할 수 있다.

따라서, 주석이나 개발 문서에서 해당 클래스의 디자인패턴 명칭과 의도를 명확하게 기술하여야 한다.



### Java의 다양한 Factory Method
GoF의 Factory 패턴과는 다르지만, Java API에서 인스턴스 생성을 위한 클래스 메서드(static 메서드)를 전반적으로 Factory Method라고 부르기도 한다.

Java API를 읽을 때는 해당 클래스에 static Factory Method가 제공되는지 확인해보자.

해당 클래스 인스턴스를 생성하는데 중요한 역할을 할 가능성이 높기 때문이다.

~~~ java

// 대표적인 인스턴스 생성 메서드 이름
// create, newInstance, getInstance ..

SecureRandom random = SecureRandom.getInstance("NativePRNG");

// 그 외 여러가지 인스턴스 생성 메서드

List<String> list = List.of("Alice", "Bob", "Chris");

List<String> list1 = Arrays.asList(arr);

String string = String.valueOf('A');

Instant instant = Instant.now();

~~~

 
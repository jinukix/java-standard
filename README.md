java.lang 패키지

java.lang 패키지는 자바프로그래밍에 가장 기본이 되는 클래스들을 포함하고 있습니다. 그렇기에 import없이 사용할 수 있도록 되어 있습니다.

## Object

Object클래스는 모든 클래스의 최고 조상입니다. 아래는 주로 사용되는 메서드 입니다.

### equals

두 개의 참조변수가 같은 객체를 참조하고 있는지, 즉 참조변수에 저장된 값(주소값)이 같은지를 확인합니다.
~~~java
public boolean equals(Object obj) { // 실제 내용.
    return (this==obj)
}

// 값으로만 확인하고 싶다면 아래와 같이 오버라이딩.
class Perosn {
    long id;

    public boolean equals(Object obj) { // 실제 내용.
        if (obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }
}
~~~

### hashCode

객체의 hashCode를 반환합니다. 일반적으로 각 객체의 주소값을 변환여 생성한 객체의 고유한 정수값입니다.
따라서 두 객체가 동일 객체인지 비교할 때 사용합니다.
특별한 설정을 하지않았을땐 System.identityHashCode()와 동일한 값이 반환됩니다.

### toString()

이 메서드는 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의되었습니다.
~~~java
public String toString() {
    return getClass().getName() +"@"+ Integer.toHexString(hashCode());
}
~~~

### clone()

자신을 복제하여 새로운 인스턴스를 생성합니다.
Cloneable인터페이스를 구현한 클래스에서만 사용할 수 있습니다.
~~~java
~~~
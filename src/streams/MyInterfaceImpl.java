package streams;

import streams.interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface{

	@Override
	public Integer sum(Integer a, Integer b) {
		return a+b;
	}

}

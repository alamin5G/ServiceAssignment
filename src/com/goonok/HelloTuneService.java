package com.goonok;
import com.goonok.Interface.*;

public class HelloTuneService implements Service{

	@Override
	public void service() {
		System.out.println("Hello Tune services have been activated.");
	}
}

package net.pocrd.demo.mock;

import net.pocrd.demo.entity.DemoEntity;
import net.pocrd.define.MockApiReturnObject;

/**
 * Created by rendong on 15/8/4.
 */
public class MockDemoEntity extends DemoEntity implements MockApiReturnObject {
    public MockDemoEntity() {
        this.id = 1234567;
        this.name = "mock test";
    }
}

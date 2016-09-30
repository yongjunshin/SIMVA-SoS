package mci;

import kr.ac.kaist.se.simulator.BaseAction;

/**
 * SeverityPTS.java
 * Severity patient first PTS class

 * Author: Junho Kim <jhkim@se.kaist.ac.kr>

 * The MIT License (MIT)

 * Copyright (c) 2016 Junho Kim

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions: TBD
 */
public class SeverityPTS extends BasePTS{
    @Override
    public int getUtility(BaseAction a) {
        return 0;
    }

    @Override
    public RescueAction choosePatient() {
        return null;
    }
}
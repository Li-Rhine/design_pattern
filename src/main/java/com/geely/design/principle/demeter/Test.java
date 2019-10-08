package com.geely.design.principle.demeter;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 15:22 2019/10/8
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}

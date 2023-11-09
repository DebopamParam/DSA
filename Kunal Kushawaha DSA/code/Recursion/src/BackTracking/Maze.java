package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(0, 0));
//        path(0, 0, "src");
//        System.out.println(path_list(0, 0, "src"));
        complete_path(0, 0, "(0,0)");
    }

    static int count(int row, int col) {
        if (col == 2 || row == 2) {
            return 1;
        }
        int down = count(row + 1, col);
        int right = count(row, col + 1);
        return down + right;
    }

    static void path(int row, int col, String path) {
        if (row == 4) {
            path = path + "->R";
            System.out.println(path);
            return;
        }
        if (col == 4) {
            path = path + "->D";
            System.out.println(path);
            return;
        }
        path(row + 1, col, path + "->D");
        path(row, col + 1, path + "->R");

    }

    static ArrayList<String> path_list(int row, int col, String path) {
        if (row == 2) {
            path = path + "->R";
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        if (col == 2) {
            path = path + "->D";
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> down = path_list(row + 1, col, path + "->D");
        ArrayList<String> right = path_list(row, col + 1, path + "->R");
        down.addAll(right);
        return down;
    }

    static void complete_path(int row, int col, String path) {
        if (row == 2 && col == 2) {
            System.out.println(path);
            return;
        }
        if (row < 2) {
            complete_path(row + 1, col, path + "->D");
        }
        if (col < 2) {
            complete_path(row, col + 1, path + "->R");
        }
        if (row < 2 && col < 2) {
            complete_path(row + 1, col + 1, path + "->Diag");
        }
    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String text;

        File dir = new File("D://Games");
        if (dir.mkdir()) {
            sb.append("Каталог создан ").append(dir).append("\n");
        } else {
            sb.append("Каталог Games не создан\n");
        }

        File src = new File(dir, "src");
        if (src.mkdir()) {
            sb.append("Каталог создан ").append(src).append("\n");
        } else {
            sb.append("Каталог src не создан\n");
        }

        File res = new File(dir, "res");
        if (res.mkdir()) {
            sb.append("Каталог создан ").append(res).append("\n");
        } else {
            sb.append("Каталог res не создан\n");
        }

        File savegames = new File(dir, "savegames");
        if (savegames.mkdir()) {
            sb.append("Каталог создан ").append(savegames).append("\n");
        } else {
            sb.append("Каталог savegames не создан\n");
        }

        File temp = new File(dir, "temp");
        if (temp.mkdir()) {
            sb.append("Каталог создан ").append(temp).append("\n");
        } else {
            sb.append("Каталог temp не создан\n");
        }

        File main = new File(src, "main");
        if (main.mkdir()) {
            sb.append("Каталог создан ").append(main).append("\n");
        } else {
            sb.append("Каталог main не создан\n");
        }

        File test = new File(src, "test");
        if (test.mkdir()) {
            sb.append("Каталог создан ").append(test).append("\n");
        } else {
            sb.append("Каталог test не создан\n");
        }

        File main1 = new File(main, "Main.java");
        try {
            if (main1.createNewFile()) {
                sb.append("Файл создан ").append(main1).append("\n");
            } else {
                sb.append("Файл Main.java не создан\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File main2 = new File(main, "Utils.java");
        try {
            if (main2.createNewFile()) {
                sb.append("Файл создан ").append(main2).append("\n");
            } else {
                sb.append("Файл Utils.java не создан\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File drawables = new File(res, "drawables");
        if (drawables.mkdir()) {
            sb.append("Каталог создан ").append(drawables).append("\n");
        } else {
            sb.append("Каталог drawables не создан\n");
        }

        File vectors = new File(res, "vectors");
        if (vectors.mkdir()) {
            sb.append("Каталог создан ").append(vectors).append("\n");
        } else {
            sb.append("Каталог vectors не создан\n");
        }
        File icons = new File(res, "icons");
        if (icons.mkdir()) {
            sb.append("Каталог создан ").append(icons).append("\n");
        } else {
            sb.append("Каталог icons не создан\n");
        }

        File temp1 = new File(temp, "temp.txt");
        try {
            if (temp1.createNewFile()) {
                sb.append("Файл создан ").append(temp1).append("\n");
            } else {
                sb.append("Файл temp.txt не создан\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        text = sb.toString();
        System.out.println(text);

        try (FileWriter writer = new FileWriter(temp1)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
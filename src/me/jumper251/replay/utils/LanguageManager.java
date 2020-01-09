package me.jumper251.replay.utils;

import me.jumper251.replay.ReplaySystem;
import me.jumper251.replay.filesystem.ConfigManager;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class LanguageManager {

    public String language = ConfigManager.LANGUAGE;
    public final static File DIR = new File(ReplaySystem.getInstance().getDataFolder() + "/languages/");
    public static File languageFile =  new File(DIR,"en.yml");
    public static FileConfiguration languageCfg = YamlConfiguration.loadConfiguration(languageFile);


    public void firstSetup() {
        if(!DIR.exists()) {
            DIR.mkdirs();
            /* English Language FIle */
            File languageFileEn =  new File(DIR,"en.yml");
            FileConfiguration languageCfgEn = YamlConfiguration.loadConfiguration(languageFileEn);

            languageCfgEn.set("you_must_be_player","You must be a player to execute this command.");
            languageCfgEn.set("update_available","An update is available:");

            languageCfgEn.set("slow","Slow");
            languageCfgEn.set("right","Right");
            languageCfgEn.set("fast","Fast");
            languageCfgEn.set("shift_right","Shift Right");
            languageCfgEn.set("leave_replay","Leave replay");
            languageCfgEn.set("seconds","seconds");
            languageCfgEn.set("resume","Resume");
            languageCfgEn.set("pause","Pause");

            try {
                languageCfgEn.save(languageFileEn);
            } catch (IOException e) {
                e.printStackTrace();
            }

            /* English Language FIle */
            File languageFileGer =  new File(DIR,"de.yml");
            FileConfiguration languageCfgGer = YamlConfiguration.loadConfiguration(languageFileGer);

            languageCfgGer.set("you_must_be_player","Du musst ein Spieler sein, um diesen Befehl auszuführen");
            languageCfgGer.set("update_available","Ein Update ist verfügbar:");
            languageCfgGer.set("slow","Langsam");
            languageCfgGer.set("right","Rechts");
            languageCfgGer.set("fast","Schnell");
            languageCfgGer.set("shift_right","Shift Rechts");
            languageCfgGer.set("leave_replay","Verlasse Replay");
            languageCfgGer.set("seconds","Sekunden");
            languageCfgGer.set("resume","Abspielen");
            languageCfgGer.set("pause","Pause");

            try {
                languageCfgGer.save(languageFileGer);
            } catch (IOException e) {
                e.printStackTrace();
            }




        }



    }

}

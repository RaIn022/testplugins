package love.chihuyu.testplugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Testplugin : JavaPlugin() {
    override fun onEnable() {
        println("ずずだぜが発狂します")
        // Plugin startup logic
        val player = Bukkit.getPlayer("hirosukt")

        if  (player == null) {
            return
        }
        player?.sendMessage("ずずだぜは好きですか？？")
        val scheduler = Bukkit.getScheduler()
        scheduler.runTaskTimer(this, Runnable {
            player?.sendMessage("このメッセージは10秒ごとに表示するぞ")
        }, 20 * 15, 20 * 10)
    }

    override fun onDisable() {
        println("ずずだぜの発狂が終わりました")
        // Plugin shutdown logic
    }
}
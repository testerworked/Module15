package com.homework.musicplayer

/**
 * Приложение «Музыкальный плеер»
 *
 * На основе приложения согласно тематики занятия по созданию медиа плеера
 * необходимо доработать приложение в своем дизайнерском стиле
 * (добавить свои цветовые гаммы, поменять картинку).
 * В дополнение необходимо создать кнопки переключения трека на следующий и предыдущий
 * с реализацией соответствующей логики. Необходимо добавить в папку raw еще несколько мелодий.
 *
 * Для работы приложения необходимо создать:
 *
 * 1.     ImageView картинки плеера.
 *
 * 2.     Seekbar изменения динамики хода мелодии.
 *
 * 3.     Кнопки play, pause, stop, next, previous.
 *
 * Необязательно, но приветствуется (усложненный уровень):
 *
 * Создать на экране приложения регулятор изменения громкости на основе Seekbar.
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
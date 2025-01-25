package com.homework.animationapp

/**
 * Приложение «Красивая анимация»
 *
 *          Необходимо написать приложение, в котором при запуске элементы стартового
 *          экрана будут появляться с анимацией: ImageView (картинка на выбор)
 *          появляется в течение 2-3 секунд, за это же время кнопка «Начать»
 *          «выезжает» с левой стороны в центр. При нажатии на кнопку
 *          выполняется переход на экран регистрации, на котором заголовок
 *          «Регистрация» смещается в направлении сверху – вниз, навстречу ему,
 *          т.е. снизу – вверх смещаются с плавным появлением поля ввода логина,
 *          пароля и кнопка «Зарегистрироваться».
 *
 *          При нажатии на кнопку регистрации выполнятся переход на активити для основной работы
 *          (оно может быть пустым).
 *
 * Для работы приложения на экране необходимо создать:
 *
 * На первом экране:
 *
 * 1.     ImageView.
 *
 * 2.     Кнопка «Начать».
 *
 * На втором экране:
 *
 * 1.     Заголовок «Регистрация».
 *
 * 2.     Поля ввода логина и пароля.
 *
 * 3.     Кнопка «Зарегистрироваться».
 *
 * На третьем экране:
 *
 * 1.     Поле вывода текста с любым текстом (можно с анимацией).
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
package com.homework.designerdashboard

/**
 *Приложение «Дизайнерский Dashboard»
 *
 * Необходимо создать дашборд(информационную панель).
 *
 * Примерный дизайн и план отображен на скрине.
 * Цветовая гамма и наполненность экрана может создаваться произвольно.
 *
 * Основными элементами дашборда можно использовать CardView.
 * По нажатию на любой элемент, выполняется переход на следующий экран (активити или фрагмент).
 *
 * В зависимости от выбора страницы, на которую был выполнен переход,
 * необходимо оформить (создать поля, сделать дизайн) ее в соответствии с ее назначением.
 * Т.е., если выполнен переход на Profile, то на странице профиля должны быть
 * поля ввода или вывода данных пользователя, его фото и т.д.
 *
 * Основной целеустановкой при создании данного приложения является
 * использование привязки представлений ViewBinding.
 *
 * Для работы приложения необходимо создать:
 *
 * На первом экране:
 *
 * 1.     CardView. Их количество может варьироваться от 4 до 6 включительно.
 *
 * На всех последующих экранах:
 *
 * 1.     Поля ввода, вывода данных, ImageView, списки RecyclerView и тд.
 * для качественного восприятия того, что на этой странице располагается.
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
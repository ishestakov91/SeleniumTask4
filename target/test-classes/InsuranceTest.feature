#language: ru

Функционал: СберСтрахование

  Сценарий: Заявка на страховку

    Когда Выбран пункт меню Страхование
    Когда Выбран пункт меню Все программы
    Тогда Ждем 2 секунды

    Тогда На странице присутствует h3 заголовок Страхование для путешественников
    Когда Страница прокручена до кнопки выбора опции Страхование для путешественников
    Когда Нажата кнопка Страхование для путешественников - Оформить онлайн

    Когда Страница прокручена до выбора опции страховой защиты
    Когда Выбрана опция минимальной страховой защиты
    Когда Страница прокручена до кнопки Оформить
    Тогда Нажата кнопка Оформить
    Тогда Ждем 5 секунд

    Когда Заполнение полей в форме:
      | insuredLastName       | Иванов        |
      | insuredFirstName      | Иван          |
      | insuredBirthDate      | 02061971      |
      | insurerLastName       | Иванов        |
      | insurerFirstName      | Иван          |
      | insurerMiddleName     | Иванович      |
      | insurerBirthDate      | 02061971      |
      | insurerGender         | Мужской       |
      | insurerPassportSeries | 0316          |
      | insurerPassportNumber | 770378        |
      | insurerDocumentDate   | 15062016      |
      | insurerDocumentIssue  | ОВД г. Москва |

    Тогда Проверка заполнения полей:
      | insuredLastName       | Иванов        |
      | insuredFirstName      | Иван          |
      | insuredBirthDate      | 02.06.1971    |
      | insurerLastName       | Иванов        |
      | insurerFirstName      | Иван          |
      | insurerMiddleName     | Иванович      |
      | insurerBirthDate      | 02.06.1971    |
      | insurerPassportSeries | 0316          |
      | insurerPassportNumber | 770378        |
      | insurerDocumentDate   | 15.06.2016    |
      | insurerDocumentIssue  | ОВД г. Москва |

    Тогда Ждем 2 секунды
    Тогда Отправка формы с данными

    Тогда Проверка предупреждений на странице:
      | warningMessageOne   | Поле не заполнено.                     |
      | warningMessageTwo   | Поле не заполнено.                     |
      | warningMessageThree | Поле не заполнено.                     |
      | formAlert           | При заполнении данных произошла ошибка |

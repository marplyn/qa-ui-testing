# <code>Автоматизация тестирования сервисов МТС Банка</code>
выпускной проект курса "QA-инженер"
## 1. Автоматизация тестирования веб-сайта [mtsbank.ru](https://www.mtsbank.ru)
### Web (десктопная версия сайта)
#### Тест-кейс 1
1. Открыть главную страницу 
2. Проскроллить до футера и перейти в раздел "Реализуемое имущество"
3. В разделе "Жилая недвижимость" посмотреть кол-во предложений у категории "Квартиры и комнаты"
4. Перейти в раздел "Квартиры и комнаты" и проверить кол-во предложений

#### Тест-кейс 2
1. Открыть главную страницу
2. Проскроллить до футера и перейти в раздел "Комплаенс и деловая этика"
3. Открыть PDF-документ "Кодекс этики"
4. Проверить, что PDF-документ содержит текст "Кодекс этики"

#### Тест-кейс 3
1. Открыть главную страницу
2. Перейти во вкладку "Ипотека"
3. В программе "Господдержка" нажать на "Если доход ниже"
4. В модальном окне перейти по ссылке "Созаемщики по ипотеке: кто может быть и зачем нужны"
5. Проверить, что название открывшейся статьи содержит слово "созаёмщик"

#### Тест-кейс 4.
1. Открыть главную страницу
2. Заполнить форму "Узнайте ваше персональное предложение" рандомными валидными значениями
3. Проверить появление поля подтверждения мобильного телефона

#### Тест-кейс 5.
1. Открыть главную страницу
2. Проскроллить до футера и перейти в раздел "Правила безопасности"
3. Пройти тест "Обмани мошенника" со всеми верными утверждениями, проверяя результат каждого вопроса
4. Проверить, что результат прохождения теста - 4/4


### Web (мобильная версия сайта)

#### Тест-кейс 1.
1. Открыть главную страницу
2. В блоке "Блог" нажать кнопку "Читать"
3. Поставить фильтр статей "Кредитные карты"
4. Проверить, что отображены статьи только этой категории

#### Тест-кейс 2.
1. Открыть главную страницу 
2. Перейти в раздел "Карты" в нижнем меню 
3. Выбрать карту Lite Мир и нажать на кнопку "Оформить карту"
4. a) Заполнить поле мобильного телефона коротким номером 
   б) Оставить поле пустым
5. Проверить, что появилась подсказка "Введите верный номер телефона"


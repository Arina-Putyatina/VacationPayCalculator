# Приложение "Калькулятор отпускных"

## Описание 
Приложение принимает твою среднюю зарплату за 12 месяцев и количество дней отпуска - отвечает суммой отпускных, которые придут сотруднику.

## Реализация:
Приложение работает по адресу localhost:8080/calculacte.
Входные параметры:
1. averageSalary - средняя зарплата за 12 месяцев
2. vacationDays - количество дней отпуска

Формула для расчета суммы отпускных: vacationDays * (averageSalary * 12 / (12 * 29.3))

## Использованные технологии:
<ol>
    <li>Сборщик проектов Maven</li>
    <li>фреймворки тестирования junit и junit-jupiter-engine</li>	
    <li>фреймворк SpringBoot</li>	
</ol>

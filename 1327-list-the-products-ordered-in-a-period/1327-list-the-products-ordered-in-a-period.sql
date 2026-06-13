# Write your MySQL query statement below
select p.product_name ,sum(o.unit)as unit
from products p 
left join orders o 
on o.product_id=p.product_id 
where year(order_date)=2020 and month(order_date)=2
group by product_name having sum(unit)>=100;
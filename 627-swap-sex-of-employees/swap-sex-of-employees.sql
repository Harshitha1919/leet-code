update Salary
set sex=CASE
        when sex='f' then 'm'
        when sex='m' then 'f'
end;
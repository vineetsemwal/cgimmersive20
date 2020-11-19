import { Pipe, PipeTransform } from '@angular/core';

@Pipe({"name":"stringlength"})
export class StringLengthPipe implements PipeTransform{
    
    transform(value: string):number {
        return value.length;
    }
    
}
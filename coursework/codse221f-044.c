#include <stdio.h>

int Initialize(void);
void Log(int vehicles);
void Summary(void);

static int type[10];               // stores types
static float unitPrice[10];        // stores unitprice, synced with type[10]
static float startingQuantity[10]; // start values, synced with type[10]
static float Remaining[10];        // stores remaining amount - syncs with type[10]
static float Quantity[10];         // stores store quantity pumped, also syncs with type[10]

/*
I use 'sync' to mean that type[i]'s unit price is stored in unitPrice[i] etc etc.

resorted to globally declared arrays as well. STATIC does not affect the code, rather it is there as a precaution

using SIZE 10 arrays to account for worst-case scenario amount of types.
*/

int main(void)
{
    int vehicles = Initialize();
    Log(vehicles);
    Summary();

    return 0;
}

// Reads Fuel Type, Unit price, Starting Quantity and Number of Vehicles visited in the given fuel shed. - DONE
int Initialize(void)
{

    int vehicles, temp, index = 0;

    for (int i = 0; i < 10; ++i)
    {
        type[i] = 0; // remove garbage values if present
    }
    /*
        a code will represent the fuel type as there can be different version of the fuel (octane 92, 95 etc etc)
        this code must be of type INT
    */

    do
    {
        printf("\nenter fuel type code (enter -1 to exit): ");
        scanf("%d", &temp);
        if (temp == -1)
        {
            break;
        }
        else
        {
            type[index] = temp;
            printf("\nenter unit price: ");
            scanf("%f", &unitPrice[index]);
            printf("\nenter initial quantity: ");
            scanf("%f", &startingQuantity[index]);

           // printf("\n\n %d %.2f %.2f", type[index], startingQuantity[index], unitPrice[index]); //- for print debugging - ignore
        }
        index++;
    } while (1);
    printf("\nenter number of vehicles that arrived at the shed today: ");
    scanf(" %d", &vehicles);
    return vehicles;
}

// Read Fuel type and quantity pumped for each vehicle in the fuel shed - DONE
// Calculate Total quantity pumped for each fuel type - DONE
// Calculate Quantity Remaining from each fuel type after pumping to all vehicles in the fuel shed - DONE

void Log(int vehicles)
{
    int id;
    float pumped;

    for (int i = 0; i < 10; ++i)
    {
        Quantity[i] = 0; // remove garbage values if present
    }

    for (int i = 0; i < vehicles; ++i)
    {
        printf("\nenter fuel type ordered: ");
        scanf(" %d", &id);
        printf("\nenter amount pumped: ");
        scanf("%f", &pumped);


        for (int i = 0; i < 10; i++)
        {
            if (type[i] == id) //does not do any validation, thus relies on user technical knowledge - a limitation
            {
                Quantity[i] += pumped;
                Remaining[i] = startingQuantity[i] - Quantity[i];
                //printf("\n\n %d %.2f %.2f %.2f %.2f", type[i], startingQuantity[i], unitPrice[i], Quantity[i], Remaining[i]); //- printf debugging - ignore

                break;
            }
        }
    }
}

// Output Total Quantity Pumped from each fuel type and Quantity Remaining from each fuel type - DONE
void Summary(void)
{
    printf("\nSUMMARY:\n");
    for (int i = 0; i < 10; ++i)
    {
        if (type[i] != 0)
        {
            printf("\n\n TYPE: %d TOTAL PUMPED: %.2f REMAINING: %.2f", type[i], Quantity[i], Remaining[i]);
        }
    }
}
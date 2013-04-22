package Pokemon;

public enum Status
{
    POISONED, PARALYZED, BURNED, FROZEN, ASLEEP, SEEDED;

    public byte byteOrdinal()
    {
        return (byte)ordinal();
    }
}

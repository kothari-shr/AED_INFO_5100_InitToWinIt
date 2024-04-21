/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Store.Items;
import Business.Inventory.DormInventoryDirectory;
import java.util.ArrayList;

/**
 *
 * @author shreyas
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private DormInventoryDirectory dormInventoryDirectory;
    private ArrayList<Items> itemsList;
    private ArrayList<ServiceTypes> serviceTypeList;
    private ArrayList<Items> foodInventoryList;
    private ArrayList<Items> stationaryInventoryList;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.itemsList = new ArrayList<>();
        this.serviceTypeList = new ArrayList<>();
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public DormInventoryDirectory getDormInventoryDirectory() {
        return dormInventoryDirectory;
    }

    public enum EnterpriseType {

        NourishmentEnterprise("Nourishment Enterprise"),
        GymHelperEnterprise("Gym Helper Enterprise"),
        HealthConsultantEnterprise("Health Consultant Enterprise"),
        UniversityHousingEnterprise("University Housing Enterprise"),
        HousingRepairEnterprise("Housing Repair Enterprise"),
        CollegeStoreEnterprise("College Store Enterprise");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public ArrayList<ServiceTypes> getServiceTypeList() {
        return serviceTypeList;
    }

    public void getServiceTypeList(ArrayList<ServiceTypes> serviceTypeList) {
        this.serviceTypeList = serviceTypeList;
    }

    public ServiceTypes createServiceType() {
        ServiceTypes service = new ServiceTypes();
        this.serviceTypeList.add(service);
        return service;
    }

    public void deleteService(ServiceTypes service) {
        this.serviceTypeList.remove(service);
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Items createMenuItem() {
        Items item = new Items();
        this.itemsList.add(item);
        return item;
    }

    public void deleteItem(Items item) {
        itemsList.remove(item);
    }
}
